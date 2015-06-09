DROP TABLE Applicant;
CREATE TABLE Applicant(
  APPLICANT_ID int NOT NULL AUTO_INCREMENT,
  LastName varchar(255),
  FirstName varchar(255),
  EMAIL varchar(255),
  DETAILS TEXT(2048),
  ADDRESS varchar(255),
  CITY varchar(255),
  STATE varchar(255),
  COUNTRY varchar(255),
  MILITARY bit(1),
  Current_Job varchar(255),
  NUM_OF_CONNECTIONS int,  
  PRIMARY KEY (APPLICANT_ID)
);

DROP TABLE Jobs;
CREATE TABLE Jobs(
  JOB_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  TITLE varchar(255),
  COMPANY_ID INT,
  isCurrent bit(1),
  PRIMARY KEY (JOB_ID),
  FOREIGN KEY (APPLICANT_ID)REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Companies;
CREATE TABLE Companies(
  COMPANY_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  NAME varchar(255),
  UNIVERSAL_NAME varchar(255),
  EMAIL_DOMAINS varchar(255),
  TYPE bit(1),
  TICKER varchar(255),
  WEBSITE varchar(255),
  INDUSTRY int,
  STATUS varchar(3),
  LOGO_URL varchar(255),
  SQUARE_LOGO_URL varchar(255),
  PRIMARY KEY (COMPANY_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);


DROP TABLE Schools;
CREATE TABLE Schools(
  SCHOOL_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  SCHOOL_NAME varchar(255),
  PRIMARY KEY (SCHOOL_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Degrees;
CREATE TABLE Degrees(
  DEGREE_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  FIELD_OF_STUDY varchar(255) NOT NULL,
  START_DATE DATE,
  END_DATE DATE,
  DEGREE varchar(255),
  PRIMARY KEY (DEGREE_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE SchoolDegree;
CREATE TABLE SchoolDegree(
  APPLICANT_ID int NOT NULL,
  SCHOOLS_ID int NOT NULL,
  DEGREES_ID int NOT NULL,
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID),
  FOREIGN KEY (SCHOOLS_ID) REFERENCES Schools(SCHOOLS_ID),
  FOREIGN KEY (DEGREES_ID) REFERENCES Degrees(DEGREES_ID),
  UNIQUE (SCHOOLS_ID,DEGREES_ID)
);

DROP TABLE Certifications;
CREATE TABLE Certifications(
  CERTIFICATION_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  NAME varchar(255),
  AUTHORITY varchar(255),
  LICENSE_NUMBER int,
  START_DATE DATE,
  END_DATE DATE,
  PRIMARY KEY (CERTIFICATION_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Skills;
CREATE TABLE Skills(
  SKILL_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  SKILL VARCHAR(255),
  PRIMARY KEY (SKILL_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Patents;
CREATE TABLE Patents(
  PATENT_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  TITLE varchar(255),
  SUMMARY TEXT(1024),
  NUMBER int,
  STATUS_ID int,
  STATUS_NAME varchar(255),
  OFFICE varchar(255),
  INVENTORS_ID int,
  INVENTORS_NAME varchar(255),
  PATENT_DATE DATE,
  URL varchar(255),
  PRIMARY KEY (PATENT_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Urls;
CREATE TABLE Urls(
  URL_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  WEBSITE varchar(255),
  PRIMARY KEY (URL_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Connections;
CREATE TABLE Connections(
  CONNECTION_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  NAME varchar(255),
  TITLE varchar(255),
  PRIMARY KEY (CONNECTION_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);

DROP TABLE Language;
CREATE TABLE Language(
  LANGUAGE_ID int NOT NULL AUTO_INCREMENT,
  APPLICANT_ID int NOT NULL,
  LANGUAGE_NAME varchar(255),
  PROFICIENCY varchar(255),
  PRIMARY KEY (LANGUAGE_ID),
  FOREIGN KEY (APPLICANT_ID) REFERENCES Applicants(APPLICANT_ID)
);