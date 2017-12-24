stocksApp.controller("delitControler",function($scope,$http){
    $scope.delit = {
      "dateCondanation":null,
      "coursAppel":null,
      "dateCommisionInfraction":null,
      "mandat_":null,
      "natureMandat":null,
      "observation":null,
      "personne.id":null,
      "typeDelit":null
    };
    $scope.personnes = null;
    $scope.onload=function () {
    const req = new XMLHttpRequest();
    var url = "http://localhost:8080/personnes";
    req.open('GET', url, false);
    req.send(null);
    if(req.status===200){
      console.log("200");
      $scope.personnes = JSON.parse(req.responseText);
      console.log($scope.personnes.nom_prenom);
    }else{
      console.log("Status de la réponse: %d ", req.status);
    }
  }
    $scope.p = null;
    $scope.updatePersonne=function (personneId) {

    }
    $scope.save=function(){
      $scope.delitToSave = {
          "date_condanation":$scope.delit.dateCondanation,
          "cours_d_appel":$scope.delit.coursAppel,
          "date_commission_infraction":$scope.delit.dateCommisionInfraction,
          "mandat":$scope.delit.mandat_,
          "nature_mandat":$scope.delit.natureMandat,
          "observation_condanation":$scope.delit.observation,
          "personne":{
              "id":parseInt($scope.p.id)
          },
          "typeDelit":$scope.delit.typeDelit
      }  ;
      alert('Okkk');
      $http.post("/delits", $scope.delitToSave).then(successCallback, errorCallback);
    };

    function successCallback(response) {
        console.log($scope.delit.typeDelit);
      console.log("C'est fait.");
    };
    function errorCallback(error) {
      console.log(error);
    };

    $scope.reset = function (){

      $scope.delit = {
        "dateCondanation":null,
        "coursAppel":null,
        "dateCommisionInfraction":null,
        "mandat_":null,
        "natureMandat":null,
        "observation":null,
        "personne.id":null,
        "typeDelit":null
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
