stocksApp.controller("casierControler",function($scope,$http){
  $scope.personnes = null;
  $scope.onload=function () {
  const req = new XMLHttpRequest();
  var url = "/personnes";
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
$scope.pdf= function () {
  //docDefinition.content[4].table.body[0]

  var docDefinition = {
    pageSize: 'A4',

  // by default we use portrait, you can change it to landscape if you wish
  //pageOrientation: 'landscape',

  // [left, top, right, bottom] or [horizontal, vertical] or just a number for equal margins
  pageMargins: [ 10, 10, 10, 10 ],
      content: [

/*0*/       {
        alignment: 'center',
        columns: [
          {
            style:'header',
            width:200,
            text: 'REPUBLIQUE DU CAMEROUN\nPaix-Travail-Patrie\n     *********     \nCOUR D\'APPEL DE L\'EXTREME-NORD\n     *********     \nTRIBUNAL DE PREMIERE INSTANCE DE MAROUA\n     *********     \nCASIER JUDICAIRE\n     *********     \nN°...../TGP/MRA'
          },
          {
            style:'header',
            width:525,
            text: 'REPUBLIC OF CAMEROON\nPeace-Work-Fatherland\n     *********     \nCOURT OF APPEAL OF \nFAR-NORTH\n     *********     \nCOURT OF FIRST INSTANCE OF \nMAROUA\n     *********     \nCRIMINAL RECORD'
          },
        ]
      },
/*1*/             '\n',
/*2*/              {
            alignment:'center',
            bold:true,
            fontSize:14,
            'text':'BULLETIN N°3\n'
          },
          {
                      alignment:'center',
                      bold:false,
                      fontSize:12,
                      'text':'BULLETIN N°3\n'
                    },
          {
                      alignment:'center',
                      bold:false,
                      fontSize:10,
                      'text':'Relevé des condamnations à'
                    },
                    {
                                alignment:'center',
                                bold:false,
                                fontSize:10,
                                'text':'des peines privatives de liberté'
                              },
                              {
                                          alignment:'center',
                                          bold:false,
                                          fontSize:10,
                                          'text':'\tnon effacées par l\'amnestie ou la réhabilitaion'
                                        },
                                        {
                                                    alignment:'center',
                                                    bold:false,
                                                    fontSize:10,
                                                    'text':'Information sheet on imprisonnement not expunged by'
                                                  },
                                                  {
                                                              alignment:'center',
                                                              bold:false,
                                                              fontSize:10,
                                                              'text':'Amnesty or rehabilitation'
                                                            },
/*9*/              '\n',
{
            bold:false,
            fontSize:10,
            width:450,
            'text':'Concernant M OUMATE\n'
          },
          {
                      bold:false,
                      fontSize:8,
                      width:450,
                      'text':'Concerning M\n'
                    },

          {
                      bold:false,
                      fontSize:10,
                      width:200,
                      'text':'Fils/Fille de: JEAN-JACQUES\n'
                    },
                    {
                                bold:false,
                                fontSize:8,
                                width:200,
                                'text':'Son/Daughter of\n'
                              },
                    {
                                bold:false,
                                fontSize:10,
                                width:200,
                                'text':'Et de:\n'
                              },
                              {
                                          alignment:'left',
                                          bold:false,
                                          fontSize:8,
                                          width:450,
                                          'text':'And:\n'
                                        },
  /*16*/                                      {
                                                    alignment:'left',
                                                    bold:false,
                                                    fontSize:10,
                                                    'text':'Né(e) le: 12/08/2015\n'
                                                  },
                                                  {
                                                              alignment:'left',
                                                              bold:false,
                                                              fontSize:8,
                                                              'text':'Born on:\n'
                                                            },
                                                            {
                                                                        alignment:'left',
                                                                        bold:false,
                                                                        fontSize:10,
                                                                        'text':'Domicilié(e) à : Maroua\n'
                                                                      },
                                                                      {
                                                                                  alignment:'left',
                                                                                  bold:false,
                                                                                  fontSize:8,
                                                                                  'text':'Resident at:\n'
                                                                                },
                                                                                {
                                                                                            alignment:'left',
                                                                                            bold:false,
                                                                                            fontSize:10,
                                                                                            'text':'Etat civil et de famille: Celibataire\n'
                                                                                          },
                                                                                          {
                                                                                                      alignment:'left',
                                                                                                      bold:false,
                                                                                                      fontSize:8,
                                                                                                      'text':'Civil status\n'
                                                                                                    },
                                                                                                    {
                                                                                                                alignment:'left',
                                                                                                                bold:false,
                                                                                                                fontSize:10,
                                                                                                                'text':'Profession: ETuduiant\n'
                                                                                                              },
    /*23*/                                                                                                          {
                                                                                                                          alignment:'left',
                                                                                                                          bold:false,
                                                                                                                          fontSize:8,
                                                                                                                          'text':'profession\n'
                                                                                                                        },
                                                                                                                        {
                                                                                                                                    alignment:'left',
                                                                                                                                    bold:false,
                                                                                                                                    fontSize:10,
                                                                                                                                    'text':'Nationalité: Camerounais\n'
                                                                                                                                  },
                                                                                                                                  {
                                                                                                                                              alignment:'left',
                                                                                                                                              bold:false,
                                                                                                                                              fontSize:8,
                                                                                                                                              'text':'Nationality\n'
                                                                                                                                            },
/*4*/             {
        style: 'tableExample',
        table: {
          widths: ['auto', 'auto', 'auto', 'auto', 'auto', 'auto'],
          headerRows: 1,
          // dontBreakRows: true,
          // keepWithHeaderRows: 1,
          body: [

            [
              {text: 'Date de(s) condamnation\n\nDate of condamnation', style: 'tableHeader', width:200},
              {text: 'Cours ou tribunaux\n\nCourts', style: 'tableHeader', width:250},
              {text: 'Nature des infractions\n-Crimes\n-Délits\n-Contraventions', style: 'tableHeader', width:20},
              {text: 'Date précise de commission de(s) infractions\n\nPrecise date of commission of offence', style: 'tableHeader', width:200},
              {text: 'Date et nature de(s) mandat(s)\n\nDate and type of warrants', style: 'tableHeader', width:200},
              {text: 'Observation(s) Condamnation(s) relatives à la circulation routière\n\nRemarks convictions On trafic offences', style: 'tableHeader', width:200}
            ],
            [' ',' ',' ',' ', ' ', ' '],
            [' ',' ',' ',' ', ' ', ' '],
            [' ',' ',' ',' ', ' ', ' '],
            [' ',' ',' ',' ', ' ', ' ']
            ]
          }
        },
      ],
      defaultStyle: {
        columnGap: 20
      },
      styles: {
        header: {
          fontSize:10
        },
        subheader: {
          fontSize: 16,
          bold: true,
          margin: [0, 10, 0, 5]
        },
        tableExample: {
          margin: [0, 5, 0, 15]
        },
        tableHeader: {
          bold: false,
          fontSize: 10,
          color: 'black'
        }
    },
  };


      var c= [];
      const req = new XMLHttpRequest();
      var url = "http://localhost:8080/personnes";
      req.open('GET', url, false);
      req.send(null);
      var obj = null;
      if (req.status===200) {
        obj = JSON.parse(req.responseText);
        console.log(obj.length);

      }
    pdfMake.createPdf(docDefinition).open();
};
});
