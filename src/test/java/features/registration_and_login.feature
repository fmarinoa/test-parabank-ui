# language: es

Característica: Registro e inicio de sesión de usuario

  @RegistrationAndLogin
  Escenario: Registro e inicio de sesión exitoso con un nuevo usuario
    Dado estoy en la pagina de parabank
    Cuando hago clic en el enlace "Register"
    Y lleno el formulario de registro con información aleatoria
    Y hago clic en el botón "Register"
    Entonces debería ver el mensaje de éxito "Your account was created successfully. You are now logged in."
    Cuando cierro sesión para probar la cuenta que acabo de crear
    E inicio sesión con la cuenta que acabo de crear
    Entonces valido haber iniciado sesión exitosamente

  @LoginSuccess
  Esquema del escenario: Inicio de sesión y exitoso
    Dado estoy en la pagina de parabank
    Cuando inicio sesión con con el usuario "<user>" y contraseña "<pass>"
    Entonces debería ver el mensaje de éxito "Welcome"

    Ejemplos:
      | user         | pass |
      | roman.rogahn | pass |