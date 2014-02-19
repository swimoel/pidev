create database anuResto ;
use anuResto ;

CREATE TABLE Utilisateur
(
ID_U varchar(10) NOT NULL,
Login varchar(255) NOT NULL,
Password varchar(255) NOT NULL,
Type_U int (1) ,
PRIMARY KEY (ID_U)
);


CREATE TABLE Restaurateur
(
ID_R varchar(10) NOT NULL,
Nom varchar(255) NOT NULL,
Prenom varchar(255) NOT NULL,
CIN varchar(8) NOT NULL,
Tel varchar(8) NOT NULL,
Addresse varchar(255),
Ville varchar(255),
Mail varchar(255),
PRIMARY KEY (ID_R)
);

CREATE TABLE Client
(
ID_C varchar(10) NOT NULL ,
Nom varchar(255) NOT NULL,
Prenom varchar(255) NOT NULL,
CIN varchar(8) NOT NULL,
Tel varchar(8) NOT NULL,
Addresse varchar(255),
Ville varchar(255),
Mail varchar(255),
PRIMARY KEY (ID_C)
);

CREATE TABLE Spetialite
(
ID_Spe varchar(10) NOT NULL,
Type_Spe varchar(10) NOT NULL,
Descri_Spe TEXT NOT NULL,
PRIMARY KEY (ID_Spe)
);

CREATE TABLE Ambiance
(
ID_Amb varchar(10) NOT NULL,
Type_Ambe varchar(10) NOT NULL,
Descri_Ambe TEXT NOT NULL,
PRIMARY KEY (ID_Amb)
);


CREATE TABLE Restaurant
(
ID_Restau varchar(10) NOT NULL,
ID_R varchar(10) NOT NULL,
Nom_R varchar(10) NOT NULL,
Rang_R date NOT NULL,
Descri_R TEXT NOT NULL,
Lien_Image varchar(255) NOT NULL,
Budget int NOT NULL,
Num_tel varchar(8) ,
ID_Spe varchar(10) NOT NULL,
ID_Amb varchar(10) NOT NULL,
PRIMARY KEY (ID_Restau),
FOREIGN KEY (ID_Spe) REFERENCES Spetialite(ID_Spe),
FOREIGN KEY (ID_Amb) REFERENCES Ambiance(ID_Amb)
);

CREATE TABLE Menu
(
ID_Menu varchar(10) NOT NULL,
ID_Restau varchar(10) NOT NULL,
Nom_Menu varchar(10) NOT NULL,
Descri_m varchar(255) NOT NULL,
Prix_m varchar(255) NOT NULL,
PRIMARY KEY (ID_Menu),
FOREIGN KEY (ID_Restau) REFERENCES Restaurant(ID_Restau)
);

CREATE TABLE Lieu
(
ID_Region varchar(10) NOT NULL,
ID_Restau varchar(10) NOT NULL,
Nom_Region varchar(255) NOT NULL,
Adresse varchar(255) NOT NULL,
Map_Resto varchar(255) NOT NULL,
PRIMARY KEY (ID_Region),
FOREIGN KEY (ID_Restau) REFERENCES Restaurant(ID_Restau)
);


CREATE TABLE Reservation
(
ID_Reserv varchar(10) NOT NULL,
ID_C varchar(10) NOT NULL,
ID_Restau varchar(10) NOT NULL,
Date_R date NOT NULL,
Heure_R time NOT NULL,
Nb_Perso int NOT NULL,
Nb_Table int NOT NULL,
ID_Menu varchar(8) ,
Prix float ,
PRIMARY KEY (ID_Reserv),
FOREIGN KEY (ID_C) REFERENCES Client(ID_C),
FOREIGN KEY (ID_Restau) REFERENCES Restaurant(ID_Restau),
FOREIGN KEY (ID_Menu) REFERENCES Menu(ID_Menu)
);

CREATE TABLE Bilan_R
(
ID_Bilan varchar(10) NOT NULL,
ID_C varchar(10) NOT NULL,
ID_Restau varchar(10) NOT NULL,
ID_Reserv varchar(10) NOT NULL,
Date_R date NOT NULL,
Total_Gain float ,
PRIMARY KEY (ID_Bilan),
FOREIGN KEY (ID_C) REFERENCES Client(ID_C),
FOREIGN KEY (ID_Restau) REFERENCES Restaurant(ID_Restau)
);
CREATE TABLE Commentaire
(
ID_Comm varchar(10) NOT NULL,
ID_C varchar(10) NOT NULL,
ID_Restau varchar(10) NOT NULL,
Date_Comm date NOT NULL,
Heure_Comm time NOT NULL,
Text_Comment TEXT NOT NULL,
PRIMARY KEY (ID_Comm),
FOREIGN KEY (ID_C) REFERENCES Client(ID_C),
FOREIGN KEY (ID_Restau) REFERENCES Restaurant(ID_Restau)
);

CREATE TABLE Reclamation
(
ID_Rec varchar(10) NOT NULL,
ID_C varchar(10) NOT NULL,
Sujet varchar(255) NOT NULL,
Date_Rec date NOT NULL,
Heure_Rec time NOT NULL,
Text_Rec TEXT NOT NULL,
PRIMARY KEY (ID_Rec),
FOREIGN KEY (ID_C) REFERENCES Client(ID_C)
);

CREATE TABLE Evaluation
(
ID_E varchar(10) NOT NULL,
ID_C varchar(10) NOT NULL,
ID_Restau varchar(10) NOT NULL,
Note_E float NOT NULL ,
PRIMARY KEY (ID_E),
FOREIGN KEY (ID_C) REFERENCES Client(ID_C),
FOREIGN KEY (ID_Restau) REFERENCES Restaurant(ID_Restau)
);



