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

# STEP 1

You need all the jarfiles in the Hiberate "required" folder. You can download these but I have
included them in the /lib

 - /src/HibernateApp.java - this app - no changes needed
 - /src/Person.java - a "POJO" to represent the table "person" and its columns - no changes needed
 - /src/Person.hbm.xml - an XML configuration file mapping the DB columns to the Java objects - no changes needed
 - /src/hibernate.cfg.xml - an XML configuration file specifying the DB infos - need to EDIT
 - /lib/... - all the Hibernate jarfiles

 Additionally I set up a PostgreSQL database on Port 5431 (5432 is default) and created a table "Person" with
 rows id = int4, name = varchar.

# STEP 2

Once you have all the Hibernate jarfiles (in /lib) you will need to tell your IDE
to use these files as resources, just the same way you tell your IDE which
database driver to use.  HOW you do this depends on which IDE you are using.

# STEP 3

Normally you would start by configuring "hibernate.cfg.xml" to tell Hibernate about
what database you are using (PostgreSQL, MySQL, SQL Server, etc.) and to tell Hiberate
about which other XML files are used to describe your tables/POJOs.  But in this
example, this file has already been configured.

# STEP 4

Normally you would create an XML file that describes each POJO, e.g. what the attributes
are and what their datatypes are. Since this example uses one POJO named Person, we
have a single XML file named "Person.hbm.xml". 
But in this example, this file has already been configured.

## Javadocs

Javadocs are the built-in documentation system in Java, so that with one
command you can create beautiful HTML files that show your source code
documentation.

This application does NOT use Javadocs

## Authors

Your friendly, neighborhood Dr. Ken and his little green friend

## License

Never operate a motor vehicle without the proper license.
