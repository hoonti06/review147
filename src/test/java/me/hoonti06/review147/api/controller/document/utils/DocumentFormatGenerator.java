package me.hoonti06.review147.api.controller.document.utils;

import org.springframework.restdocs.snippet.Attributes;

import static org.springframework.restdocs.snippet.Attributes.key;

public interface DocumentFormatGenerator {
    static Attributes.Attribute getDateFormat() {
        return key("format").value("yyyy-MM-dd");
    }
}
