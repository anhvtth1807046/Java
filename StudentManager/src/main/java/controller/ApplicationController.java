package controller;

import java.io.IOException;

public interface ApplicationController {
    void create();
    void writer() throws IOException;
    void readList();
    void delete();
}
