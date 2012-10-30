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
package org.encog.parse.expression.operators;

import org.encog.ml.prg.EncogProgram;
import org.encog.ml.prg.ProgramNode;
import org.encog.ml.prg.NodeOperator;
import org.encog.parse.expression.expvalue.ExpressionValue;

public class ExpressionOperatorLessThanEqual extends NodeOperator {

	public ExpressionOperatorLessThanEqual(final EncogProgram theOwner,ProgramNode argA,
			ProgramNode argB) {
		super(theOwner,"<=", argA, argB);
	}
	
	@Override
	public ExpressionValue evaluate() {
		return new ExpressionValue(getArgs().get(0).evaluate().toFloatValue() <= getArgs().get(1).evaluate().toFloatValue());
	}
}
