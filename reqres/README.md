# Test automation for services

Construction of automated tests with the Screenplay Pattern of Serenity, Cucumber, Junit,
Java and Gradle to test api's

For this automation the service is used https://reqres.in/

 ### Built tests 📋

 - List users (GET)
 - Create users (POST)
 - Update users (PUT)
 - Delete users (DELETE)

## Requirements to use the project 🛠️ ##

 - Java JDK 1.8
 - Gradle 3.2.0 o superior
 - GIT 

## Design pattern used 🧮

- ### [Serenity Screenplay Pattern](http://serenity-bdd.info/docs/articles/screenplay-tutorial.html)
- ### [Patron Builder](https://github.com/sauljabin/design-patterns-java#builder)

 ## Project structure 🗼
    .
    ├──     .
    ├── src              
    │   ├── main                         # Source files
    │   │   └── com.siigo.qa
    │   │       ├── exceptions           #  Classes that catch exceptions and throw custom messages when automation fails due to it is not found what was expected.
    |   |       |
    │   │       ├── models               # Classes with which the data models are built using the builder pattern.
    │   │       │   └── builder              #  Builder Pattern Classes
    │   │       │
    │   │       ├── questions            # Classes with which values are obtained from the application to be verified (asserts).
    │   │       │                         
    │   │       ├── tasks                #  Classes that perform high-level actions, such as login in the application, enter data into a form, etc.
    │   │       │
    │   │       └── utils                # Classes that contain common functionalities, such as string handling.
    │   │                        
    │   ├── test                         # Files for running tests
    │   │   ├── com.siigo.qa
    │   │   │   ├── runners              # Classes to execute the automations with the scenarios indicated in the equivalents Features.
    │   │   │   │
    │   │   │   └── stepdefinitions      # Classes that allow the translation of the Gherkin language used in the Features into machine language, thus they make possible the execution of automation.
    |   |   |                              There is a general Step Definitions class that contains the configuration and steps that are repeated in the other Step Definitions, therefore the General inherits to the others.
    │   │   │    
    │   │   └── resources
    │   │       ├── features             # The project features are found here.
    │   │       │
    │   │       └── schema               # Package where json file is stored with the schema of the service
    │   └── ···
    │
    └── ···

## Compilation ⚙️

Download the project and import it into the IDE of preference. 

It is important to compile the project for this, run any of the following commands.

Run by console

```
gradle clean build -x test
gradle compileJava
```

## Execution 🚀

**Execution All tests**

To run all the tests of the project and generate the report you can use.

```
gradle clean test aggregate
```

**NOTE:** The generated report of the tests is generated on the route `/target/site/serenity/index.html`

## Authors ✒
* **Laura Marcela Velásquez Areiza** - [Lvelasq55@gmail.com]