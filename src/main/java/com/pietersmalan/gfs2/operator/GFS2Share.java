package com.pietersmalan.gfs2.operator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group(GFS2Share.GROUP)
@Version(GFS2Share.VERSION)
@JsonInclude(Include.NON_NULL)
public class GFS2Share extends CustomResource<Void,Void> implements Namespaced {
    public static final String GROUP="storage.pietersmalan.com";
    public static final String VERSION="v1";
    public static final String NAME="sharedstorage"+GROUP;

}

