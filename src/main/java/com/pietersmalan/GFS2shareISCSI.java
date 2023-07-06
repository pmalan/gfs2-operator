package com.pietersmalan;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Version("v1")
@Group("storage.pietersmalan.com")
public class GFS2shareISCSI extends CustomResource<GFS2shareISCSISpec, GFS2shareISCSIStatus> implements Namespaced {}

