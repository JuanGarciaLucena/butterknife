package butterknife;

import butterknife.compiler.ButterKnifeProcessor;
import com.google.testing.compile.JavaFileObjects;
import javax.tools.JavaFileObject;
import org.junit.Test;

import static com.google.common.truth.Truth.assertAbout;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public class BindArrayTest {
  @Test public void stringArray() throws Exception {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import android.app.Activity;\n"
        + "import butterknife.BindArray;\n"
        + "public class Test extends Activity {\n"
        + "  @BindArray(1) String[] one;\n"
        + "}"
    );

    JavaFileObject bindingSource = JavaFileObjects.forSourceString("test/Test_ViewBinding", ""
        + "// Generated code from Butter Knife. Do not modify!\n"
        + "package test;\n"
        + "import android.content.Context;\n"
        + "import android.content.res.Resources;\n"
        + "import android.view.View;\n"
        + "import butterknife.Unbinder;\n"
        + "import java.lang.Deprecated;\n"
        + "import java.lang.IllegalStateException;\n"
        + "import java.lang.Override;\n"
        + "import java.lang.SuppressWarnings;\n"
        + "public class Test_ViewBinding<T extends Test> implements Unbinder {\n"
        + "  protected T target;\n"
        + "  /**\n"
        + "   * @deprecated Use {@link #Test_ViewBinding(T, Context)} for direct creation.\n"
        + "   *     Only present for runtime invocation through {@code ButterKnife.bind()}.\n"
        + "   */\n"
        + "  @Deprecated\n"
        + "  public Test_ViewBinding(T target, View source) {\n"
        + "    this(target, source.getContext());\n"
        + "  }\n"
        + "  @SuppressWarnings(\"ResourceType\")\n"
        + "  public Test_ViewBinding(T target, Context context) {\n"
        + "    this.target = target;\n"
        + "    Resources res = context.getResources();\n"
        + "    target.one = res.getStringArray(1);\n"
        + "  }\n"
        + "  @Override\n"
        + "  public void unbind() {\n"
        + "    if (this.target == null) throw new IllegalStateException(\"Bindings already cleared.\");\n"
        + "    this.target = null;\n"
        + "  }\n"
        + "}"
    );


    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .compilesWithoutWarnings()
        .and()
        .generatesSources(bindingSource);
  }

  @Test public void intArray() throws Exception {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import android.app.Activity;\n"
        + "import butterknife.BindArray;\n"
        + "public class Test extends Activity {\n"
        + "  @BindArray(1) int[] one;\n"
        + "}"
    );

    JavaFileObject bindingSource = JavaFileObjects.forSourceString("test/Test_ViewBinding", ""
        + "// Generated code from Butter Knife. Do not modify!\n"
        + "package test;\n"
        + "import android.content.Context;\n"
        + "import android.content.res.Resources;\n"
        + "import android.view.View;\n"
        + "import butterknife.Unbinder;\n"
        + "import java.lang.Deprecated;\n"
        + "import java.lang.IllegalStateException;\n"
        + "import java.lang.Override;\n"
        + "import java.lang.SuppressWarnings;\n"
        + "public class Test_ViewBinding<T extends Test> implements Unbinder {\n"
        + "  protected T target;\n"
        + "  /**\n"
        + "   * @deprecated Use {@link #Test_ViewBinding(T, Context)} for direct creation.\n"
        + "   *     Only present for runtime invocation through {@code ButterKnife.bind()}.\n"
        + "   */\n"
        + "  @Deprecated\n"
        + "  public Test_ViewBinding(T target, View source) {\n"
        + "    this(target, source.getContext());\n"
        + "  }\n"
        + "  @SuppressWarnings(\"ResourceType\")\n"
        + "  public Test_ViewBinding(T target, Context context) {\n"
        + "    this.target = target;\n"
        + "    Resources res = context.getResources();\n"
        + "    target.one = res.getIntArray(1);\n"
        + "  }\n"
        + "  @Override\n"
        + "  public void unbind() {\n"
        + "    if (this.target == null) throw new IllegalStateException(\"Bindings already cleared.\");\n"
        + "    this.target = null;\n"
        + "  }\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .compilesWithoutWarnings()
        .and()
        .generatesSources(bindingSource);
  }

  @Test public void textArray() throws Exception {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import android.app.Activity;\n"
        + "import butterknife.BindArray;\n"
        + "public class Test extends Activity {\n"
        + "  @BindArray(1) CharSequence[] one;\n"
        + "}"
    );

    JavaFileObject bindingSource = JavaFileObjects.forSourceString("test/Test_ViewBinding", ""
        + "// Generated code from Butter Knife. Do not modify!\n"
        + "package test;\n"
        + "import android.content.Context;\n"
        + "import android.content.res.Resources;\n"
        + "import android.view.View;\n"
        + "import butterknife.Unbinder;\n"
        + "import java.lang.Deprecated;\n"
        + "import java.lang.IllegalStateException;\n"
        + "import java.lang.Override;\n"
        + "import java.lang.SuppressWarnings;\n"
        + "public class Test_ViewBinding<T extends Test> implements Unbinder {\n"
        + "  protected T target;\n"
        + "  /**\n"
        + "   * @deprecated Use {@link #Test_ViewBinding(T, Context)} for direct creation.\n"
        + "   *     Only present for runtime invocation through {@code ButterKnife.bind()}.\n"
        + "   */\n"
        + "  @Deprecated\n"
        + "  public Test_ViewBinding(T target, View source) {\n"
        + "    this(target, source.getContext());\n"
        + "  }\n"
        + "  @SuppressWarnings(\"ResourceType\")\n"
        + "  public Test_ViewBinding(T target, Context context) {\n"
        + "    this.target = target;\n"
        + "    Resources res = context.getResources();\n"
        + "    target.one = res.getTextArray(1);\n"
        + "  }\n"
        + "  @Override\n"
        + "  public void unbind() {\n"
        + "    if (this.target == null) throw new IllegalStateException(\"Bindings already cleared.\");\n"
        + "    this.target = null;\n"
        + "  }\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .compilesWithoutWarnings()
        .and()
        .generatesSources(bindingSource);
  }

  @Test public void typedArray() throws Exception {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import android.app.Activity;\n"
        + "import butterknife.BindArray;\n"
        + "import android.content.res.TypedArray;\n"
        + "public class Test extends Activity {\n"
        + "  @BindArray(1) TypedArray one;\n"
        + "}"
    );

    JavaFileObject bindingSource = JavaFileObjects.forSourceString("test/Test_ViewBinding", ""
        + "// Generated code from Butter Knife. Do not modify!\n"
        + "package test;\n"
        + "import android.content.Context;\n"
        + "import android.content.res.Resources;\n"
        + "import android.view.View;\n"
        + "import butterknife.Unbinder;\n"
        + "import java.lang.Deprecated;\n"
        + "import java.lang.IllegalStateException;\n"
        + "import java.lang.Override;\n"
        + "import java.lang.SuppressWarnings;\n"
        + "public class Test_ViewBinding<T extends Test> implements Unbinder {\n"
        + "  protected T target;\n"
        + "  /**\n"
        + "   * @deprecated Use {@link #Test_ViewBinding(T, Context)} for direct creation.\n"
        + "   *     Only present for runtime invocation through {@code ButterKnife.bind()}.\n"
        + "   */\n"
        + "  @Deprecated\n"
        + "  public Test_ViewBinding(T target, View source) {\n"
        + "    this(target, source.getContext());\n"
        + "  }\n"
        + "  @SuppressWarnings(\"ResourceType\")\n"
        + "  public Test_ViewBinding(T target, Context context) {\n"
        + "    this.target = target;\n"
        + "    Resources res = context.getResources();\n"
        + "    target.one = res.obtainTypedArray(1);\n"
        + "  }\n"
        + "  @Override\n"
        + "  public void unbind() {\n"
        + "    if (this.target == null) throw new IllegalStateException(\"Bindings already cleared.\");\n"
        + "    this.target = null;\n"
        + "  }\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .compilesWithoutWarnings()
        .and()
        .generatesSources(bindingSource);
  }

  @Test public void typeMustBeSupported() {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import android.app.Activity;\n"
        + "import butterknife.BindArray;\n"
        + "public class Test extends Activity {\n"
        + "  @BindArray(1) String one;\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .failsToCompile()
        .withErrorContaining(
            "@BindArray field type must be one of: String[], int[], CharSequence[], "
                + "android.content.res.TypedArray. (test.Test.one)")
        .in(source).onLine(5);
  }
}
