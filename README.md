# Hibernate Test Drive

This is the simplest possible Hibernate app, showing how to put data into a DB
and get data out using Hibernate.


## Table of Contents

- [Installation](#installation)
- [Javadocs](#javadocs)
- [Authors](#authors)
- [License](#license)
- [CHANGELOG.md](CHANGELOG.md)


## Changelog

For a detailed list of changes and version history, please refer to the [CHANGELOG.md](CHANGELOG.md) file.

## Installation

You need all the jarfiles in the Hiberate "required" folder. You can download these but I have
included them in the /lib

 - /src/HibernateApp.java - this app - no changes needed
 - /src/Person.java - a "POJO" to represent the table "person" and its columns - no changes needed
 - /src/Person.hbm.xml - an XML configuration file mapping the DB columns to the Java objects - no changes needed
 - /src/hibernate.cfg.xml - an XML configuration file specifying the DB infos - need to EDIT
 - /lib/... - all the Hibernate jarfiles

 Additionally I set up a PostgreSQL database on Port 5431 (5432 is default) and created a table "Person" with
 rows id = int4, name = varchar.

## Javadocs

Javadocs are the built-in documentation system in Java, so that with one
command you can create beautiful HTML files that show your source code
documentation.

This application does NOT use Javadocs

## Authors

Your friendly, neighborhood Dr. Ken and his little green friend

## License

Never operate a motor vehicle without the proper license.