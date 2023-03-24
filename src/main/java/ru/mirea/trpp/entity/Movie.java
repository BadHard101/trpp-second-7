package ru.mirea.trpp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** Сущность сотрудника. */
@Getter
@Setter
@ToString
public class Movie {

    /** Идентификатор. */
    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;
    /** Название фильма. */
    @JsonProperty("name")
    @CsvBindByName(column = "name")
    private String name;
    /** Жанр. */
    @JsonProperty("genre")
    @CsvBindByName(column = "genre")
    private String genre;
    /** Студия. */
    @JsonProperty("studio")
    @CsvBindByName(column = "studio")
    private String studio;
    /** Дата выхода в прокат. */
    @JsonProperty("created")
    @CsvBindByName(column = "created")
    private String created;

}
