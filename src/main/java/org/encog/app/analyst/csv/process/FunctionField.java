/*
 * Encog(tm) Core v3.2 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2012 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.app.analyst.csv.process;

import java.util.List;

import org.encog.ml.prg.EncogProgram;
import org.encog.ml.prg.ProgramNode;
import org.encog.ml.prg.NodeFunction;
import org.encog.parse.expression.expvalue.ExpressionValue;

public class FunctionField extends NodeFunction {
	
	private ProcessExtension extension;

	public FunctionField(ProcessExtension theExtension, EncogProgram theOwner, ProgramNode[] theArgs) {
		super(theOwner, "field", theArgs);
		this.extension = theExtension;
	}

	@Override
	public ExpressionValue evaluate() {
		String fieldName = this.getArgs().get(0).evaluate().toStringValue();
		int fieldIndex = (int)this.getArgs().get(1).evaluate().toFloatValue()+this.extension.getBackwardWindowSize();
		String value = this.extension.getField(fieldName,fieldIndex);
		return new ExpressionValue(value);
	}

}
