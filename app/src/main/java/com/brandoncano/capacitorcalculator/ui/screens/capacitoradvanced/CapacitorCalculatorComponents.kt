package com.brandoncano.capacitorcalculator.ui.screens.capacitoradvanced

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.brandoncano.capacitorcalculator.R
import com.brandoncano.capacitorcalculator.model.capacitorlegacy.CapacitorLegacy
import com.brandoncano.capacitorcalculator.util.formatCapacitance
import com.brandoncano.capacitorcalculator.util.formatCode
import com.brandoncano.capacitorcalculator.util.getTolerancePercentage
import com.brandoncano.capacitorcalculator.util.getVoltageRating
import com.brandoncano.sharedcomponents.composables.AppCard
import com.brandoncano.sharedcomponents.text.onSurfaceVariant
import com.brandoncano.sharedcomponents.text.textStyleHeadline
import com.brandoncano.sharedcomponents.text.textStyleSubhead
import com.brandoncano.sharedcomponents.text.textStyleTitle

@Composable
fun TabText(@StringRes title: Int) {
    Text(
        text = stringResource(id = title),
        style = textStyleSubhead()
    )
}

@Composable
fun CapacitanceText(
    capacitorLegacy: CapacitorLegacy,
    isError: Boolean,
    isCode: Boolean,
) {
    val capacitance: String
    var tolerance = ""
    var voltage = ""
    when {
        isError -> capacitance = stringResource(id = R.string.error_na)
        isCode -> {
            capacitance = if (capacitorLegacy.isEmpty()) {
                stringResource(id = R.string.default_code)
            } else {
                capacitorLegacy.formatCapacitance()
            }
            tolerance = capacitorLegacy.getTolerancePercentage()
            voltage = capacitorLegacy.getVoltageRating()
        }
        else -> {
            capacitance = if (capacitorLegacy.isEmpty(false)) {
                stringResource(id = R.string.default_capacitance)
            } else {
                "Code: " + capacitorLegacy.formatCode() + capacitorLegacy.tolerance
            }
        }
    }
    AppCard(modifier = Modifier.padding(top = 24.dp)) {
        Text(
            text = "$capacitance $tolerance".trimEnd(),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 6.dp, bottom = 6.dp, start = 12.dp, end = 12.dp),
            style = textStyleTitle(),
        )
        if (voltage.isNotEmpty()) {
            Text(
                text = voltage,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 2.dp, bottom = 6.dp, start = 12.dp, end = 12.dp),
                style = textStyleTitle(),
            )
        }
    }
}

@Composable
fun CapacitorInformation() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier.padding(start = 16.dp, top = 24.dp),
                imageVector = Icons.Outlined.Info,
                contentDescription = null,
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurfaceVariant)
            )
            Text(
                text = stringResource(id = R.string.capacitor_calculator_information_header),
                modifier = Modifier.padding(start = 8.dp, end = 16.dp, top = 24.dp),
                style = textStyleHeadline().onSurfaceVariant(),
            )
        }
        AppCard {
            Text(
                text = stringResource(id = R.string.capacitor_calculator_information_body_1),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp),
                style = textStyleSubhead(),
            )
        }
    }
}
