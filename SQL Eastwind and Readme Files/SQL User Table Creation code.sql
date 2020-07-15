CREATE TABLE users (
    PersonID INT auto_increment not null,
    username varchar(255),
    password varchar(255),
    Email VARCHAR(255),
    CustomerID VARCHAR(255),
    StorFile BLOB,
    roleid int
    
    Constraint PK_User Primary Key (PersonID),
    CONSTRAINT FK_User_Role FOREIGN KEY (roleid) REFERENCES DIVISIONS(DIVISIONID),
    CONSTRAINT FK_User_Customer FOREIGN KEY (CustomerID) REFERENCES CUSTOMERS(CUSTOMERID)
);

