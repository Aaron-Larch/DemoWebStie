CREATE TABLE users (
    PersonID INT auto_increment not null,
    username varchar(255),
    password varchar(255),
    Email VARCHAR(255),
    CustomerID VARCHAR(255),
    StorFile BLOB,
    KeyQuestion varchar(280),
    KeyAnswer varchar(255),
    roleid int
    
    Constraint PK_User Primary Key (PersonID),
    CONSTRAINT FK_User_Role FOREIGN KEY (roleid) REFERENCES DIVISIONS(DIVISIONID),
    CONSTRAINT FK_User_Customer FOREIGN KEY (CustomerID) REFERENCES CUSTOMERS(CUSTOMERID)
);

CREATE TABLE PasswordResetToken (
    Id INT not null,
    token varchar(255),
    userid INT,
    expiryDate Timestamp,
    IsUsed CHAR(1) default 0,
    
    Constraint PK_PasswordResetToken Primary Key (Id),
    CONSTRAINT FK_PasswordResetToken_User FOREIGN KEY (userid) REFERENCES USERS (PersonID)
);
CREATE SEQUENCE Token_SEQ START WITH 1;
