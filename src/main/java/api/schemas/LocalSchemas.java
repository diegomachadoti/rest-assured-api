package api.schemas;

public enum LocalSchemas {

    EVENTO_DETALHE("src/test/resources/jsonschema/evento_schema.json");

    private String path;

    LocalSchemas(String path) {
        this.path = path;
    }

    public String path() {
        return this.path;
    }


}
