package com.example.fields;

/**
 * Created by Ajmal on 10/16/18.
 */
public class EntryField {

    private int row;
    private int column;

    public EntryField(final int rowNum, final int columnNum) {
        this.row = rowNum;
        this.column = columnNum;
    }

    /**
     * Ger row number of the field.
     * @return row number
     */
    public final int getRow() {
        return row;
    }

    /**
     * Get column number of the field.
     * @return column number
     */
    public final int getColumn() {
        return column;
    }
}
