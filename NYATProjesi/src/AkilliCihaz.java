public class AkilliCihaz {
    private String Name;
    private String Surum;
    private String Dil;
    private String Id;
    public static class Builder {
        private String name ;
        private String surum ;
        private String dil;
        private String id;
        public Builder Name(String name) {
            this.name = name;
            return this;
        }
        public Builder Surum(String surum) {
            this.surum=surum;
            return this;
        }
        public Builder Dil(String dil) {
            this.dil= dil;

            return this;
        }
        public Builder Id(String id){
            this.id=id;
            return this;
        }
        public AkilliCihaz build() {
            return new AkilliCihaz(this);
        }
    }
    public AkilliCihaz(Builder builder) {

        Name = builder.name;
        Surum = builder.surum;
        Dil= builder.dil;
    }
    public String toString() {
        return   this.Name + "," + this.Surum + "," + this.Dil/*+ ","+this.Id*/;
    }

}

