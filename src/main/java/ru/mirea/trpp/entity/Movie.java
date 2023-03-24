package ru.mirea.trpp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** �������� ����������. */
@Getter
@Setter
@ToString
public class Movie {

    /** �������������. */
    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;
    /** �������� ������. */
    @JsonProperty("name")
    @CsvBindByName(column = "name")
    private String name;
    /** ����. */
    @JsonProperty("genre")
    @CsvBindByName(column = "genre")
    private String genre;
    /** ������. */
    @JsonProperty("studio")
    @CsvBindByName(column = "studio")
    private String studio;
    /** ���� ������ � ������. */
    @JsonProperty("created")
    @CsvBindByName(column = "created")
    private String created;

}
