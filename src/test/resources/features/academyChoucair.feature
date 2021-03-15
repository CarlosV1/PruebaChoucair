#Autor: Carlos Valero

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario Outline: Search for a automation course
      Given than Carlos wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called resources Automatizacion Bancolombia
        | strCourse   |
        | <strCourse> |

      Examples:
        | strUser | strPassword  | strCourse                |
        | carlos  | Febrero2021* | Cursos y Certificaciones |

