package org.deeplearning4j.models.abstractvectors.sequence;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Sequence for AbstractVectors is defined as limited set of SequenceElements. It can also contain label, if you're going to learn Sequence features as well.
 *
 * @author raver119@gmail.com
 */
public class Sequence<T extends SequenceElement> {
    @Getter @Setter protected List<T> elements;
    @Getter @Setter protected T label;
}
