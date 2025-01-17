package electron.core


external interface Certificate {
// Docs: https://electronjs.org/docs/api/structures/certificate
    /**
     * PEM encoded data
     */
    var data: String

    /**
     * Fingerprint of the certificate
     */
    var fingerprint: String

    /**
     * Issuer principal
     */
    var issuer: CertificatePrincipal

    /**
     * Issuer certificate (if not self-signed)
     */
    var issuerCert: Certificate

    /**
     * Issuer's Common Name
     */
    var issuerName: String

    /**
     * Hex value represented string
     */
    var serialNumber: String

    /**
     * Subject principal
     */
    var subject: CertificatePrincipal

    /**
     * Subject's Common Name
     */
    var subjectName: String

    /**
     * End date of the certificate being valid in seconds
     */
    var validExpiry: Double

    /**
     * Start date of the certificate being valid in seconds
     */
    var validStart: Double
}
