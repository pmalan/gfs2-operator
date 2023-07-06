package com.pietersmalan;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

public class GFS2shareFCReconciler implements Reconciler<GFS2shareFC> { 
  private final KubernetesClient client;

  public GFS2shareFCReconciler(KubernetesClient client) {
    this.client = client;
  }

  // TODO Fill in the rest of the reconciler

  @Override
  public UpdateControl<GFS2shareFC> reconcile(GFS2shareFC resource, Context context) {
    // TODO: fill in logic

    return UpdateControl.noUpdate();
  }
}

