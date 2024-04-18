/**
 * This class represents a dto for a typeImage.
 */
package co.simplon.gamebotsback.business.dto;

import java.util.Date;

/**
 * This class represents a type of image.
 */
public class TypeImageDTO {

    /** The identifier of the type of image. */
    private int idTypeImage;

    /** The name of the type of image. */
    private String name;

    /** The creation date of the type of image. */
    private Date creationDate;

    /** The modification date of the type of image. */
    private Date modificationDate;

    /**
     * Returns the identifier of the type of image.
     * 
     * @return The identifier of the type of image.
     */
    public int getIdTypeImage() {
        return idTypeImage;
    }

    /**
     * Sets the identifier of the type of image.
     * 
     * @param idTypeImage The identifier of the type of image.
     */
    public void setIdTypeImage(int idTypeImage) {
        this.idTypeImage = idTypeImage;
    }

    /**
     * Returns the name of the type of image.
     * 
     * @return The name of the type of image.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the type of image.
     * 
     * @param name The name of the type of image.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the creation date of the type of image.
     * 
     * @return The creation date of the type of image.
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creation date of the type of image.
     * 
     * @param creationDate The creation date of the type of image.
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the modification date of the type of image.
     * 
     * @return The modification date of the type of image.
     */
    public Date getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the modification date of the type of image.
     * 
     * @param modificationDate The modification date of the type of image.
     */
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
}
