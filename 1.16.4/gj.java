/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.AbstractList;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nonnull;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ public class gj<E> extends AbstractList<E> {
/*    */   private final List<E> a;
/*    */   private final E b;
/*    */   
/*    */   public static <E> gj<E> a() {
/* 14 */     return new gj<>();
/*    */   }
/*    */ 
/*    */   
/*    */   public static <E> gj<E> a(int ☃, E e) {
/* 19 */     Validate.notNull(e);
/*    */     
/* 21 */     Object[] arrayOfObject = new Object[☃];
/* 22 */     Arrays.fill(arrayOfObject, e);
/* 23 */     return new gj<>(Arrays.asList((E[])arrayOfObject), e);
/*    */   }
/*    */   
/*    */   @SafeVarargs
/*    */   public static <E> gj<E> a(E ☃, E... arrayOfE) {
/* 28 */     return new gj<>(Arrays.asList(arrayOfE), ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected gj() {
/* 35 */     this(Lists.newArrayList(), null);
/*    */   }
/*    */   
/*    */   protected gj(List<E> ☃, @Nullable E e) {
/* 39 */     this.a = ☃;
/* 40 */     this.b = e;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public E get(int ☃) {
/* 46 */     return this.a.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public E set(int ☃, E e) {
/* 51 */     Validate.notNull(e);
/*    */     
/* 53 */     return this.a.set(☃, e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void add(int ☃, E e) {
/* 58 */     Validate.notNull(e);
/*    */     
/* 60 */     this.a.add(☃, e);
/*    */   }
/*    */ 
/*    */   
/*    */   public E remove(int ☃) {
/* 65 */     return this.a.remove(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 70 */     return this.a.size();
/*    */   }
/*    */ 
/*    */   
/*    */   public void clear() {
/* 75 */     if (this.b == null) {
/* 76 */       super.clear();
/*    */     } else {
/* 78 */       for (int ☃ = 0; ☃ < size(); ☃++)
/* 79 */         set(☃, this.b); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */