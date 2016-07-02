
angular.module('myApp', [])

.controller('mainController', function($scope) {
  $scope.sortType     = 'name'; // set the default sort type
  $scope.sortReverse  = false;  // set the default sort order
  $scope.searchFish   = '';     // set the default search/filter term
  
  $scope.student = [
    { firstname: 'Steve', lastname: 'Shekhar', points: 2 },
    { firstname: 'Bill', lastname: 'Masand', points: 4 },
    { firstname: 'John', lastname: 'Gupta', points: 7 },
    { firstname: 'Matthew', lastname: 'Sharma', points: 6 }
  ];
  
});
