package com.github.kr328.zloader.gradle.util

import com.android.build.api.artifact.Artifacts
import com.android.build.api.artifact.impl.ArtifactsImpl
import com.android.build.api.component.analytics.AnalyticsEnabledArtifacts

fun Artifacts.resolveImpl(): ArtifactsImpl {
    return when (this) {
        is AnalyticsEnabledArtifacts -> delegate.resolveImpl()
        is ArtifactsImpl -> this
        else -> error("Unsupported artifacts: $this")
    }
}