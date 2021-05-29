control MyIngress() {
    apply {
        if (hdr.p4calc.isValid()) {
            calculate.apply();
        } 
        else {
            operation_drop();
        }
    }
}