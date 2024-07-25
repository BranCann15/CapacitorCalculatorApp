package com.brandoncano.capacitorcalculator.components

/**
 * Job: Is all the standard codes for a ceramic capacitor
 */
enum class CapacitorCodeConversions(
    private val code: String,
    private val pf: String,
    private val nf: String,
    private val uf: String
) {
    CODE_100("100", "10", "0.01 ", "0.00001 "),
    CODE_120("120", "12", "0.012", "0.000012"),
    CODE_150("150", "15", "0.015", "0.000015"),
    CODE_180("180", "18", "0.018", "0.000018"),
    CODE_220("220", "22", "0.022", "0.000022"),
    CODE_250("250", "25", "0.025", "0.000025"),
    CODE_270("270", "27", "0.027", "0.000027"),
    CODE_330("330", "33", "0.033", "0.000033"),
    CODE_390("390", "39", "0.039", "0.000039"),
    CODE_470("470", "47", "0.047", "0.000047"),
    CODE_560("560", "56", "0.056", "0.000056"),
    CODE_680("680", "68", "0.068", "0.000068"),
    CODE_820("820", "82", "0.082", "0.000082"),

    CODE_101("101", "100", "0.1 ", "0.0001 "),
    CODE_121("121", "120", "0.12", "0.00012"),
    CODE_151("151", "150", "0.15", "0.00015"),
    CODE_181("181", "180", "0.18", "0.00018"),
    CODE_221("221", "220", "0.22", "0.00022"),
    CODE_251("251", "250", "0.25", "0.00025"),
    CODE_271("271", "270", "0.27", "0.00027"),
    CODE_331("331", "330", "0.33", "0.00033"),
    CODE_391("391", "390", "0.39", "0.00039"),
    CODE_471("471", "470", "0.47", "0.00047"),
    CODE_561("561", "560", "0.56", "0.00056"),
    CODE_681("681", "680", "0.68", "0.00068"),
    CODE_821("821", "820", "0.82", "0.00082"),

    CODE_102("102", "1000", "1.0", "0.001 "),
    CODE_122("122", "1200", "1.2", "0.0012"),
    CODE_152("152", "1500", "1.5", "0.0015"),
    CODE_182("182", "1800", "1.8", "0.0018"),
    CODE_222("222", "2200", "2.2", "0.0022"),
    CODE_252("252", "2500", "2.5", "0.0025"),
    CODE_272("272", "2700", "2.7", "0.0027"),
    CODE_332("332", "3300", "3.3", "0.0033"),
    CODE_392("392", "3900", "3.9", "0.0039"),
    CODE_472("472", "4700", "4.7", "0.0047"),
    CODE_562("562", "5600", "5.6", "0.0056"),
    CODE_682("682", "6800", "6.8", "0.0068"),
    CODE_822("822", "8200", "8.2", "0.0082"),

    CODE_103("103", "10000", "10", "0.01 "),
    CODE_123("123", "12000", "12", "0.012"),
    CODE_153("153", "15000", "15", "0.015"),
    CODE_183("183", "18000", "18", "0.018"),
    CODE_223("223", "22000", "22", "0.022"),
    CODE_253("253", "25000", "25", "0.025"),
    CODE_273("273", "27000", "27", "0.027"),
    CODE_333("333", "33000", "33", "0.033"),
    CODE_393("393", "39000", "39", "0.039"),
    CODE_473("473", "47000", "47", "0.047"),
    CODE_563("563", "56000", "56", "0.056"),
    CODE_683("683", "68000", "68", "0.068"),
    CODE_823("823", "82000", "82", "0.082"),

    CODE_104("104", "100000", "100", "0.1 "),
    CODE_124("124", "120000", "120", "0.12"),
    CODE_154("154", "150000", "150", "0.15"),
    CODE_184("184", "180000", "180", "0.18"),
    CODE_224("224", "220000", "220", "0.22"),
    CODE_254("254", "250000", "250", "0.25"),
    CODE_274("274", "270000", "270", "0.27"),
    CODE_334("334", "330000", "330", "0.33"),
    CODE_394("394", "390000", "390", "0.39"),
    CODE_474("474", "470000", "470", "0.47"),
    CODE_564("564", "560000", "560", "0.56"),
    CODE_684("684", "680000", "680", "0.68"),
    CODE_824("824", "820000", "820", "0.82"),

    CODE_105("105", "1000000", "1000", "1.0"),
    CODE_125("125", "1200000", "1200", "1.2"),
    CODE_155("155", "1500000", "1500", "1.5"),
    CODE_185("185", "1800000", "1800", "1.8"),
    CODE_225("225", "2200000", "2200", "2.2"),
    CODE_255("255", "2500000", "2500", "2.5"),
    CODE_275("275", "2700000", "2700", "2.7"),
    CODE_335("335", "3300000", "3300", "3.3"),
    CODE_395("395", "3900000", "3900", "3.9"),
    CODE_475("475", "4700000", "4700", "4.7"),
    CODE_565("565", "5600000", "5600", "5.6"),
    CODE_685("685", "6800000", "6800", "6.8"),
    CODE_825("825", "8200000", "8200", "8.2");

    fun asList(): List<String> {
        return listOf(code, pf, nf, uf)
    }
}
