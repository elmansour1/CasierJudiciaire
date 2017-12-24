stocksApp.controller("personneControler",function($scope,$http){
    $scope.personne={
      "nom":null,
      "dateNaissance":null,
      "lieuNaissance":null,
      "nomPere":null,
      "nomMere":null,
      "departement":null,
      "region":null,
      "etatCivil":null
    };
    $scope.save=function(){
      $scope.personToSave = {
        "nom_prenom":$scope.personne.nom,
        "date_naissance":$scope.personne.dateNaissance,
        "lieu_naissance":$scope.personne.lieuNaissance,
        "nom_pere":$scope.personne.nomPere,
        "nom_mere":$scope.personne.nomMere,
        "domicile":$scope.personne.departement,
        "statut_matrimoniale":$scope.personne.etatCivil,
        "profession":"Enseignant",
        "nationalite":"Camerounaise"
      };
//      alert('Okkk');
      $http.post("/personnes", $scope.personToSave).then(successCallback, errorCallback);
    };
    function successCallback(response) {
        console.log($scope.personne.dateNaissance);
      console.log("C'est fait.");
    };
    function errorCallback(error) {
      console.log(error);
    };
    $scope.reset = function () {
      $scope.personne={
        "nom":null,
        "dateNaissance":null,
        "lieuNaissance":null,
        "nomPere":null,
        "nomMere":null,
        "departement":null,
        "region":null,
        "etatCivil":null
      };
    };
    var currentTime = new Date();
    $scope.currentTime = currentTime;
    $scope.month = ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'];
    $scope.moisEng = ['JANUARY', 'FEBRUARY', 'MARCH', 'APRIL', 'MAY', 'JUNE', 'JULY', 'AUGUST', 'SEPTEMBER', 'OCTOBER', 'NOVEMBER', 'DECEMBER'];
    $scope.monthShort = ['Jan', 'Fév', 'Mar', 'Avr', 'Mai', 'Juin', 'Juil', 'Août', 'Sep', 'Oct', 'Nov', 'Dec'];
    $scope.weekdaysFull = ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'];
    $scope.weekdaysLetter = ['D', 'L', 'M', 'M', 'J', 'V', 'S'];
    $scope.disable = [false, 1, 7];
    $scope.today = 'Aujourd\'hui';
    $scope.clear = 'Effacer';
    $scope.close = 'Ok';
    var days = 15;
    $scope.minDate = new Date(1990, 11, 17).toISOString();
    $scope.maxDate = new Date().toISOString();
    $scope.onStart = function () {
        console.log('onStart');
    };
    $scope.onRender = function () {
        console.log('onRender');
    };
    $scope.onOpen = function () {
        console.log('onOpen');
    };
    $scope.onClose = function () {
        console.log('onClose');
    };
    $scope.onSet = function () {
        console.log('onSet');
    };
    $scope.onStop = function () {
        console.log('onStop');

    };
   /* $scope.personnes=null;
    $scope.var=0;
    $scope.pages={};
    $scope.charger=function(){
    $http.get("/personnes")
            .then(function(response){
            $scope.personnes=response.data;
            $scope.pages= new Array(response.data.totalPages);
           });
       };


    $scope.goto=function(p){
    $scope.var=p;
    $scope.charger();
    };
    /*$scope.vu=null;
    $scope.requete=null;
    $scope.requetePclient=function(cli){
    $http.get("/reclient/"+cli)
            .then(function(response){
             $scope.requete=response.data;
             console.log(response.data);
            },function(error){});
    };*/

   /*$scope.newclient={};
    $scope.inscription=function (){
    $http.post("/personnes")
            .then(function(response){
                $scope.newclient=response.data;
              alert("Vous Avez été Bien Enrégistré Cliquez sur Suivant");

            });


    };

    /*$scope.supriClient=function(cl){
    $http.delete("/delclients/" +cl)
            .then(function(response){

            },function(error){});
    };
   $scope.reponce=null;
   $scope.nom="";
   $scope.Chercher=function(){
   $http.get("/lclientsparnom?nom="+$scope.nom)
           .then(function(response){
              $scope.reponce=response.data;
              console.log($scope.reponce);
           });

   };

});

app.controller("techController", function($scope,$http){

    $scope.techniciens=null;
    $scope.listetechnicien=function(){
    $http.get("/allTech")
            .then(function(response){
             $scope.techniciens=response.data;


            });
       */
    });
