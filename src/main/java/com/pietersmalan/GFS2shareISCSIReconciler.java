package com.pietersmalan;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

public class GFS2shareISCSIReconciler implements Reconciler<GFS2shareISCSI> { 
  private final KubernetesClient client;

  public GFS2shareISCSIReconciler(KubernetesClient client) {
    this.client = client;
  }

  // TODO Fill in the rest of the reconciler

  @Override
  public UpdateControl<GFS2shareISCSI> reconcile(GFS2shareISCSI resource, Context context) {
    // TODO: fill in logic

    return UpdateControl.noUpdate();
  }
}

