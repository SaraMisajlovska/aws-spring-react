import React, { useState, useEffect, useCallback } from 'react';
import axios from 'axios';
import Dropzone from './Dropzone';
import './App.css';
const UserProfiles = () => {

    const [UserProfiles, setUserProfiles] = useState([]);

    const fetchUserProfiles = () => {
        axios.get("http://localhost:8080/api/v1/user-profile")
            .then(res => {
                console.log(res);
                const data = res.data;
                setUserProfiles(res.data);
            });
    }
    useEffect(
        () => {
            fetchUserProfiles();
        },
        []
    )
    return UserProfiles.map((userProfile, index) => {
        return (
            <div key={index}>
                {/* {todo: profile image} */}
                {userProfile.userProfileId ? (<img src={`http://localhost:8080/api/v1/user-profile/${userProfile.userProfileId}/image/download`}/>)
                : null
                }
                <br/> 
                <br/>
                <h1>{userProfile.username}</h1>
                <p>{userProfile.userProfileId}</p>
                <Dropzone {...userProfile} />
                <br />
            </div>
        )
    });
}


export default UserProfiles;