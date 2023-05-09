# Microservices for Movie catalog service

Api service to fetch movie details.  
Can request for movie details for a particular director.  
Has the following **_Microservices_** :
- `movie-service`: provides movie details.
- `director-service`: provides director details.
- `api-gateway` : The api gateway to interact all microservices from single port by user.

Uses **_eureka-server_** for service discovery.