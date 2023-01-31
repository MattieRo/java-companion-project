'use strict';

angular.module('MGL_Task1_app').factory('MGL_Task1_Service', ['$http', function($http) {

		var REST_SERVICE_URI = 'game';

		var factory = {
			fetchAllGames : fetchAllGames,
			saveOrUpdateGame : saveOrUpdateGame,
			deleteGame : deleteGame
		};

		return factory;

		function fetchAllGames() {
			return $http.get(REST_SERVICE_URI).then(function(response) {
					return response.data;
				}
			);
		}

		function saveOrUpdateGame(game) {
			return $http.post(REST_SERVICE_URI, game).then(function(response) {
					return response.data;
				}
			);
		}
		
		function deleteGame(gameToDelete) {
			return $http.delete(REST_SERVICE_URI + "/" + gameToDelete ).then(function(response){
				return response.data;
			});
		}

}]);
