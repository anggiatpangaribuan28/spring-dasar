/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmerjamannow.core.data.Bar;
import programmerjamannow.core.data.Foo;
import programmerjamannow.core.data.FooBar;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: DepedencyInjectionTests.java, v 0.1 2022‐10‐28 20.22 anggiat.pangaribuan Exp $$
 */
public class DependencyInjectionTests {
        @Test
        void testNoDI(){
            var foo = new Foo();
            var bar = new Bar();

            var fooBar = new FooBar(foo , bar);

            Assertions.assertSame(foo , fooBar.getFoo());
            Assertions.assertSame(bar , fooBar.getBar());
        }
}