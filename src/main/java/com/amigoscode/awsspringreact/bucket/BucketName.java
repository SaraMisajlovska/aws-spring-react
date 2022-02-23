package com.amigoscode.awsspringreact.bucket;

public enum BucketName {
    PROFILE_IMAGE("aws-frontend-345");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
