$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dtulimowski/Downloads/TwitterFE/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Twitter",
  "description": "",
  "id": "login-to-twitter",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Twitter account",
  "description": "\r\nGiven: User is already on Twitter login page\r\nWhen: Title of login page is Zaloguj się do Twittera\r\nThen: User enters username and password\r\nThen: User click on login button\r\nAnd: User is on home page",
  "id": "login-to-twitter;login-to-twitter-account",
  "type": "scenario",
  "keyword": "Scenario"
});
});