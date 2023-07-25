package com.brandoncano.capacitorcalculatorapp.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.brandoncano.capacitorcalculatorapp.ui.theme.CapacitorCalculatorAppTheme

/**
 * Job: Holds all the designs for text within the app
 */

@Composable
fun TextTitle(
    modifier: Modifier = Modifier,
    text: String,
) {
    val textStyle = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
    )
    AppText(modifier, text, textStyle)
}

@Composable
fun TextHeadline(
    modifier: Modifier = Modifier,
    text: String,
) {
    val textStyle = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    )
    AppText(modifier, text, textStyle)
}

@Composable
fun TextBody(
    modifier: Modifier = Modifier,
    text: String,
) {
    val textStyle = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    )
    AppText(modifier, text, textStyle)
}

@Composable
private fun AppText(modifier: Modifier, text: String, textStyle: TextStyle) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyle,
    )
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun TextComponentsPreview() {
    CapacitorCalculatorAppTheme {
        Column {
            TextTitle(text = "Title")
            TextHeadline(text = "Headline")
            TextBody(text = "Body")
        }
    }
}
