package ru.mirea.trpp.controllers;

import com.opencsv.bean.CsvToBeanBuilder;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import ru.mirea.trpp.entity.Movie;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

/** ���������� ��� ������ � ��������. */
@Controller("/movie")
public class MovieController {

    /** ������ �������. */
    private final List<Movie> movieList;

    /** �����������. */
    public MovieController() {
        movieList = new CsvToBeanBuilder<Movie>(new InputStreamReader(
                this.getClass().getResourceAsStream("/MOCK_DATA.csv")
        )).withType(Movie.class).build().parse();
    }

    /**
     * �������� ������ �������.
     * @return ������ �������
     */
    @Get()
    public HttpResponse<List<Movie>> getMovie() {
        return HttpResponse.ok(movieList);
    }

    /**
     * ����� ����� �� ��������������.
     * @param id ������������� ������
     * @return �����, ���� ����, ����� 404 ������
     */
    @Get("/{id}")
    public HttpResponse<Movie> findById(Long id) {
        Optional<Movie> result = movieList.stream().filter(it -> it.getId().equals(id)).findAny();
        if (result.isPresent()) {
            return HttpResponse.ok(result.get());
        } else {
            return HttpResponse.notFound();
        }
    }
}
