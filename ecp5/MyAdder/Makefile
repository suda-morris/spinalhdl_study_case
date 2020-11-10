TARGET=MyAdder

all: ${TARGET}.bit

$(TARGET).json: $(wildcard ../../simWorkspace/$(TARGET)/rtl/*.v)
	yosys -p "synth_ecp5 -json $@" $^

$(TARGET)_out.config: $(TARGET).json
	nextpnr-ecp5 --25k --package CABGA381 --speed 6 --freq 65 --json $< --textcfg $@ --lpf io.lpf --lpf-allow-unconstrained

$(TARGET).bit: $(TARGET)_out.config
	ecppack $< --bit $@ --svf ${TARGET}.svf

${TARGET}.svf : ${TARGET}.bit

clean:
	rm -f *.svf *.bit *.config *.ys

.PHONY: clean
