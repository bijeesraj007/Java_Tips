/*
 * from aws dynamo sdk
 */

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ComparisonOperator {

    EQ("EQ"),
    NE("NE"),
    IN("IN"),
    LE("LE"),
    LT("LT"),
    GE("GE"),
    GT("GT"),
    BETWEEN("BETWEEN"),
    NOT_NULL("NOT_NULL"),
    NULL("NULL"),
    CONTAINS("CONTAINS"),
    NOT_CONTAINS("NOT_CONTAINS"),
    BEGINS_WITH("BEGINS_WITH");

    private String value;

    private ComparisonOperator(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ComparisonOperator corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ComparisonOperator fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ComparisonOperator enumEntry : ComparisonOperator.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
