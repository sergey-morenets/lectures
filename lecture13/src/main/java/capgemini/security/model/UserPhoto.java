package capgemini.security.model;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Lob;

public class UserPhoto {

    private User user;

    private String name;

    private int size;

    //private String url;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contents;
}
