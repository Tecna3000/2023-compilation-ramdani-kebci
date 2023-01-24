/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ACas10Typeop extends PTypeop
{
    private PTypevar _typevar_;

    public ACas10Typeop()
    {
        // Constructor
    }

    public ACas10Typeop(
        @SuppressWarnings("hiding") PTypevar _typevar_)
    {
        // Constructor
        setTypevar(_typevar_);

    }

    @Override
    public Object clone()
    {
        return new ACas10Typeop(
            cloneNode(this._typevar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACas10Typeop(this);
    }

    public PTypevar getTypevar()
    {
        return this._typevar_;
    }

    public void setTypevar(PTypevar node)
    {
        if(this._typevar_ != null)
        {
            this._typevar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typevar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._typevar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._typevar_ == child)
        {
            this._typevar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._typevar_ == oldChild)
        {
            setTypevar((PTypevar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
