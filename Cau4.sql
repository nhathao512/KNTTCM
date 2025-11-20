-- TẠO CƠ SỞ DỮ LIỆU VÀ CÁC BẢNG

-- Tạo bảng Phòng ban (Departments)
CREATE TABLE Departments (
    DepartmentID VARCHAR(10) PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL
);

-- Tạo bảng Nhân viên (Employees)
CREATE TABLE Employees (
    EmployeeID VARCHAR(10) PRIMARY KEY,
    FullName VARCHAR(100) NOT NULL,
    DepartmentID VARCHAR(10),
    Salary DECIMAL(15, 2),
    HireDate DATE,
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

-- Tạo bảng Dự án (Projects)
CREATE TABLE Projects (
    ProjectID VARCHAR(10) PRIMARY KEY,
    ProjectName VARCHAR(100) NOT NULL,
    DepartmentID VARCHAR(10),
    Budget DECIMAL(15, 2),
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

-- THÊM DỮ LIỆU MẪU
INSERT INTO Departments VALUES 
('IT', 'Công nghệ thông tin'),
('HR', 'Nhân sự'),
('FIN', 'Tài chính');

INSERT INTO Employees VALUES 
('NV001', 'Nguyen Van A', 'IT', 50000000, '2020-01-15'),
('NV002', 'Tran Thi B', 'IT', 60000000, '2019-05-20'),
('NV003', 'Le Van C', 'HR', 45000000, '2021-03-10'),
('NV004', 'Pham Thi D', 'FIN', 55000000, '2020-07-01'),
('NV005', 'Hoang Van E', 'IT', 70000000, '2018-11-25');

INSERT INTO Projects VALUES 
('PRJ001', 'Website mới', 'IT', 500000000),
('PRJ002', 'Hệ thống HR', 'HR', 300000000),
('PRJ003', 'Phần mềm kế toán', 'FIN', 400000000);

-- CÂU a: Hiển thị thông tin nhân viên thuộc phòng IT
SELECT e.*
FROM Employees e
JOIN Departments d ON e.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Công nghệ thông tin';

-- CÂU b: Danh sách nhân viên kèm tên phòng ban và thống kê số lượng nhân viên
-- Phần 1: Danh sách nhân viên kèm tên phòng ban
SELECT 
    e.EmployeeID,
    e.FullName,
    d.DepartmentName,
    e.Salary,
    e.HireDate
FROM Employees e
LEFT JOIN Departments d ON e.DepartmentID = d.DepartmentID;

-- Phần 2: Thống kê số lượng nhân viên của từng phòng ban
SELECT 
    d.DepartmentName,
    COUNT(e.EmployeeID) AS SoLuongNhanVien
FROM Departments d
LEFT JOIN Employees e ON d.DepartmentID = e.DepartmentID
GROUP BY d.DepartmentName;

-- CÂU c: Xóa bản ghi trùng trong bảng Employees dựa vào EmployeeID
-- Cách phổ biến và an toàn nhất trên MySQL 8+ / MariaDB 10.3+ / SQL Server / PostgreSQL
DELETE e
FROM Employees e
INNER JOIN (
    SELECT EmployeeID, 
           ROW_NUMBER() OVER (PARTITION BY EmployeeID ORDER BY HireDate) AS rn
    FROM Employees
) ranked ON e.EmployeeID = ranked.EmployeeID AND ranked.rn > 1;


-- CÂU d: Phòng ban có tổng lương > 100 triệu, số lượng và lương trung bình
SELECT 
    d.DepartmentName,
    COUNT(e.EmployeeID) AS SoLuongNhanVien,
    AVG(e.Salary) AS LuongTrungBinh,
    SUM(e.Salary) AS TongLuong
FROM Departments d
JOIN Employees e ON d.DepartmentID = e.DepartmentID
GROUP BY d.DepartmentName
HAVING SUM(e.Salary) > 100000000;