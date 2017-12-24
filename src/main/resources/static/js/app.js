var stocksApp = angular.module("stocksApp", ['ui.materialize', 'ngRoute', 'ngResource']);

stocksApp.config(stateConfig);
function stateConfig($routeProvider, $locationProvider) {
  $locationProvider.hashPrefix('');
  $routeProvider
    //NOTIFICATIONS Controllers
    .when("/personnes", {
      templateUrl:"views/personne.html",
      controller:"personneControler"
    })
    
     .when("/casiers", {
      templateUrl:"views/casier.html",
      controller:"casierControler"
    })
    
    .when("/delits", {
      templateUrl:"views/delit.html",
      controller:"delitControler"
    })
}


    