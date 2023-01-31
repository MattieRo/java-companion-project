'use strict';

angular.module('MGL_Task1_app').controller('MGL_Task1_Controller',
		[ 'MGL_Task1_Service','$log', function(MGL_Task1_Service, $log) {
			var self = this;
			self.game = {
				game_id : '',
				game_name : '',
				game_genre : ''
			};
			self.games = [];

			self.fetchAllGames = function(){
				MGL_Task1_Service.fetchAllGames().then(function(data) {
					self.games = data;
				});
			}

			self.saveOrUpdateGame = function(){
				return MGL_Task1_Service.saveOrUpdateGame(self.game).then( function() {
				self.game = {};
				self.fetchAllGames();
				});
			}
			
			self.selectGame = function(selectedGame){
				self.game = angular.copy(selectedGame);
			}
			
					
			self.deleteGame = function(gameToDelete){
				return MGL_Task1_Service.deleteGame(gameToDelete).then(function(data){
					$log.debug(data);
					self.fetchAllGames();
				});
			}
			
			self.clearGame = function(){
				self.game = {};
			}

			self.fetchAllGames();
		} ]);
