package br.org.serratec.biblioteca.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.org.serratec.biblioteca.dtos.RestApiDto;

@Service
public class ClientRestService {

	@Autowired
	RestTemplate restTemplate;
	private String url = "https://fakestoreapi.com/users/";

	public RestApiDto consultaUser(Integer id) {
		String uri = url + "/{id}";
		Map<String, Integer> params = new HashMap<String, Integer>();

		params.put("id", id);

		RestApiDto dto = restTemplate.getForObject(uri, RestApiDto.class, params);

		return dto;
	}

	public List<RestApiDto> consultaAllUsers() {
		List<RestApiDto> usersDto = new ArrayList<>();

		RestApiDto[] dto = restTemplate.getForObject(url, RestApiDto[].class);
		for(RestApiDto userDto: dto) {
			usersDto.add(userDto);
		}
		return usersDto;
	}
}