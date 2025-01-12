package com.example.team2_be.album.page.dto;

import java.util.Map;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AlbumPageUpdateRequestDTO {
    private Map<String, Object> shapes;

    private Map<String, Object> bindings;

    private Map<String, AssetDTO> assets;

    @NotEmpty
    private String capturePage;

    @Getter
    public static class AssetDTO {
        @NotEmpty
        private String id;
        @NotEmpty
        private String type;
        @NotEmpty
        private String fileName;
        @NotEmpty
        private String src;
        @NotNull
        private double[] size;
    }
}
