package com.amigoscode.awsspringreact.bucket;

public enum BucketName {
    PROFILE_IMAGE("aws-demo-image-444");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
