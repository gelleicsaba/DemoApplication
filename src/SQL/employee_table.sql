CREATE VIEW [dbo].[employee_table]
AS
SELECT dbo.companies.id AS companyid,
    dbo.companies.nev AS companynev,
    dbo.employees.id AS employeeid,
    dbo.employees.nev AS employeenev
FROM dbo.employees
LEFT OUTER JOIN dbo.companies ON dbo.employees.company_id = dbo.companies.id
GO
